from flask import Flask, render_template, request, jsonify
import json
import os

app = Flask(__name__)
DB_FILE = 'data/users.json'

# Helper to load/save user data
def load_db():
    if not os.path.exists(DB_FILE): return {}
    with open(DB_FILE, 'r') as f: return json.load(f)

def save_db(data):
    with open(DB_FILE, 'w') as f: json.dump(data, f, indent=4)

@app.route('/')
def index():
    return render_template('index.html')

# API Route to handle progress updates
@app.route('/api/save-progress', methods=['POST'])
def save_progress():
    data = request.json
    db = load_db()
    email = data.get('email')
    
    if email in db:
        db[email]['progress'] = data.get('progress')
        save_db(db)
        return jsonify({"status": "success"})
    return jsonify({"status": "error"}), 404

if __name__ == '__main__':
    app.run(debug=True)
