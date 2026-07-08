document.addEventListener('DOMContentLoaded', () => {
    // Complete 163-entry compiled directory dataset
    const phoneDirectory = [
        {"name": "Adam Stevenson", "number": "Ext. 2065", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Amy McClain", "number": "Ext. 2061", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Andres Cruz", "number": "Ext. 5108", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Anthony Golriz", "number": "Ext. 2302", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Austin Ferguson", "number": "Ext. 2075", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Baylee Williams", "number": "Ext. 2033", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Bradey Burge", "number": "Ext. 2007", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Brandon Bosler", "number": "Ext. 2032", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Brandon McMillan", "number": "Ext. 2152", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Brandon Murray", "number": "Ext. 2063", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Brannon Townsend", "number": "Ext. 3712", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Breakroom (Virginia)", "number": "Ext. 4023", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Brent Cooksey", "number": "Ext. 2024", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Brett Hawkins", "number": "Ext. 2039", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Brian Hansen", "number": "Ext. 5110", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Bryce Sanders", "number": "Ext. 2498", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Carly McCaslin", "number": "Ext. 2014", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Catherine Wright", "number": "Ext. 2307", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Cecilia Jaimes", "number": "Ext. 5130", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Chad Hubbard", "number": "Ext. 2064", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Chris Hicks", "number": "Ext. 2050", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Clayton Frizzell", "number": "Ext. 2308", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Conference Room (El Reno)", "number": "Ext. 2069", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Curtis Roach", "number": "Ext. 2048", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Danielle Waddle", "number": "Ext. 2003", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "David Jackson", "number": "Ext. 2054", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "David Smith", "number": "Ext. 2317", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Devan Moschella", "number": "Ext. 2312", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Eric Palmer", "number": "Ext. 2017", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "GP Front Desk", "number": "Ext. 5107", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "GP QC", "number": "Ext. 5113", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "GP QC 2", "number": "Ext. 5120", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "GP Conference", "number": "Ext. 5112", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Harmon Ray", "number": "Ext. 2016", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Haylee Hunt", "number": "Ext. 2013", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Holbrook Main", "number": "Ext. 5800", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Holbrook Shipping", "number": "Ext. 5806", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "I.T. Department", "number": "Ext. 2300", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jacob Archer", "number": "Ext. 2306", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jamie Gulickson", "number": "Ext. 2005", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jason Melton", "number": "Ext. 2037", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jeff Williams", "number": "Ext. 2072", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jeffrey Thomas", "number": "Ext. 2067", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jennifer Awbrey", "number": "Ext. 2040", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jennifer Sorrels", "number": "Ext. 2036", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Jenny Cripps", "number": "Ext. 2056", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "John Broyles", "number": "Ext. 2052", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "John Casillas", "number": "Ext. 3715", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Katherine Newsome", "number": "Ext. 2015", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Keith Jones", "number": "Ext. 7000", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Kelly Lawrence", "number": "Ext. 2305", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Kevin Cloyd", "number": "Ext. 2043", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Klay Turk", "number": "Ext. 2009", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Larry Blevins", "number": "Ext. 2051", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Lea Cole", "number": "Ext. 2030", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Marie Stevens", "number": "Ext. 2057", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Mark Newman", "number": "Ext. 2049", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Marti Canida", "number": "Ext. 2028", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Martin Negrete", "number": "Ext. 5115", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Matt Peterman", "number": "Ext. 2068", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Maygan Mitchell", "number": "Ext. 2315", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Michael Boblit", "number": "Ext. 2035", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Mike Boyd", "number": "Ext. 5122", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Nao Vang", "number": "Ext. 2313", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Natalie Evans", "number": "Ext. 2044", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Natalie Palmer", "number": "Ext. 2073", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Nathan Stutler", "number": "Ext. 3720", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Nick Alles", "number": "Ext. 5807", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Nick Minichello", "number": "Ext. 5805", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Patrick Fees", "number": "Ext. 2303", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Q. A.", "number": "Ext. 2038", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Receiving (El Reno)", "number": "Ext. 2006", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Rees Nelson", "number": "Ext. 2042", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Richard Gulickson", "number": "Ext. 2045", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Rodney Wickersham", "number": "Ext. 2023", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Scott McAvoy", "number": "Ext. 4021", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Scott Rott", "number": "Ext. 2066", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Sergio Estela-Zevala", "number": "Ext. 4018", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Shane Darnell", "number": "Ext. 2022", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Shawnee Jones", "number": "Ext. 2076", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Shweta Sajish", "number": "Ext. 2318", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Steven Garza", "number": "Ext. 8000", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Terra Awbrey", "number": "Ext. 2053", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Tia Johnson", "number": "Ext. 5117", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Tim Strohsnitter", "number": "Ext. 5815", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Tori Brite", "number": "Ext. 2012", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Tyler Headley", "number": "Ext. 2021", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "William Barnes", "number": "Ext. 3722", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Vanessa Blevins", "number": "Ext. 2071", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "VA Customer Service", "number": "Ext. 4010", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Vickie Scharp", "number": "Ext. 2026", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Zakry Rios", "number": "Ext. 2320", "dept": "Internal Staff", "loc": "Corporate"},
        {"name": "Albert Flores", "number": "(626) 533-2718", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Albert Rodriguez", "number": "(469) 571-1065", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Anah Goryl", "number": "(920) 420-5405", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Bob Bein", "number": "(516) 639-4331", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Billy Huse", "number": "(405) 702-2257", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Brett Burrows", "number": "(626) 826-2786", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Brian Hansen", "number": "(817) 715-6107", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Brian Hilton", "number": "(913) 201-2555", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Carla Zenn", "number": "(469) 815-3708", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Chris Marban", "number": "4808686517", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Christy Norton", "number": "(816) 682-7233", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "David Hopkins", "number": "(469) 670-7254", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "David Potter", "number": "6307159425", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Dean Orteig", "number": "(206) 550-1821", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Dustin McCartney", "number": "(786) 914-2707", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Germain Sanchez", "number": "(559) 552-3343", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Greg McCorkindale", "number": "(252) 470-8718", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Jarrad Biffinger", "number": "(413) 531-6522", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Jeremy Farmer", "number": "(913) 249-5132", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Joey Harrison", "number": "(305) 968-9821", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "John Toole", "number": "(404) 710-2758", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Julie Russell", "number": "(206) 445-2646", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Kirby Smith", "number": "2564409304", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Larry Moore", "number": "3037200434", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Lon Vaughn", "number": "(206) 979-0431", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Madison Howard", "number": "(205) 223-9994", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Mark Baltzley", "number": "(515) 620-9673", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Michael McCully", "number": "(219) 869-8312", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Michael Griffin", "number": "(620) 779-0669", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Michael Mulvenna", "number": "(317) 373-3666", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Mike Arndt", "number": "6128681904", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Mike Green", "number": "(405) 550-3076", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Pat Abernethy", "number": "(541) 816-8982", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Paul Korytkowski", "number": "(347) 967-6334", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Randell Burd", "number": "(412) 627-9260", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Rich Ruiz", "number": "(631) 459-6096", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Rob Dolman", "number": "4056417390", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Syd Light", "number": "(954) 729-1246", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Tim Strohsnitter", "number": "(516) 650-2213", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Tyler Due", "number": "(707) 344-2837", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Tyler Stutts", "number": "(817) 876-5111", "dept": "Outside Sales", "loc": "Gemini Sales Rep"},
        {"name": "Chris Hicks", "number": "8172479696", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "Rodney Wickersham", "number": "(405) 834-1210", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "Jason Melton", "number": "(405) 664-7901", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "Jenny Cripps", "number": "(405) 827-6209", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "Bob Bein", "number": "(516) 639-4331", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "David Potter", "number": "(630) 715-9425", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "Marti Canida", "number": "(405) 694-5945", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "Kevin Laughlin", "number": "(774) 764-7564", "dept": "Executive Team", "loc": "Corporate"},
        {"name": "Eric Palmer (OK)", "number": "4053452017", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Tim Strohsnitter (NY)", "number": "4053455815", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Danielle Waddle (OK)", "number": "4053452003", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Haylee Hunt (OK)", "number": "4053452013", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Jamie Gulickson (OK)", "number": "4053452005", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Carly McCaslin (OK)", "number": "4053452014", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Nao Vang (WA)", "number": "(405) 345-2313", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Tori Brite (OK)", "number": "(405) 345-2012", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Baylee Williams (OK)", "number": "(405)345-2033", "dept": "Customer Service / Inside Sales", "loc": "Corporate"},
        {"name": "Jonathan Nunez", "number": "(210)722-4093", "dept": "F-H & Associates", "loc": "San Antonio/Valley/Houston"},
        {"name": "AR Brown", "number": "(512) 422-4802", "dept": "F-H & Associates", "loc": "Austin Area/Bryan/College Station"},
        {"name": "Betsy Valente", "number": "(713) 876-3093", "dept": "F-H & Associates", "loc": "Houston/Coastal"},
        {"name": "Brent Shouse", "number": "4054231344", "dept": "F-H & Associates", "loc": "Oklahoma/Arkansas"},
        {"name": "Bruce Smoot", "number": "(832) 704-9091", "dept": "F-H & Associates", "loc": "Houston-North"},
        {"name": "Carrie Hicks", "number": "8179464617", "dept": "F-H & Associates", "loc": "Finance"},
        {"name": "Caleb Holt", "number": "(214)597-9073", "dept": "F-H & Associates", "loc": "Office Administrator/Corporate Office"},
        {"name": "Jamie Holt", "number": "4698670618", "dept": "F-H & Associates", "loc": "All (Owner)"},
        {"name": "JC Cornia", "number": "(817)709-4126", "dept": "F-H & Associates", "loc": "Dallas/Fort Worth/West Texas/Mid-Tex"},
        {"name": "Ron Denne", "number": "9728325050", "dept": "F-H & Associates", "loc": "Dallas/E.TX/North toOK Border/NE Louisiana"},
        {"name": "Roy Young", "number": "(713) 494-6028", "dept": "F-H & Associates", "loc": "Houston/Louisiana"},
        {"name": "Shannon Holt", "number": "(469) 569-7783", "dept": "F-H & Associates", "loc": "General Manager"}
    ];

    const searchInput = document.getElementById('portalSearchInput');
    const resultsContainer = document.getElementById('searchResults');

    // Filter mechanism on input change
    searchInput.addEventListener('input', (e) => {
        const query = e.target.value.toLowerCase().trim();
        
        // Only trigger matches when 2 or more characters are typed
        if (query.length < 2) {
            resultsContainer.innerHTML = '';
            resultsContainer.classList.add('hidden');
            return;
        }

        const matches = phoneDirectory.filter(person => {
            return person.name.toLowerCase().includes(query) || 
                   person.number.toLowerCase().includes(query) || 
                   person.dept.toLowerCase().includes(query) || 
                   person.loc.toLowerCase().includes(query);
        });

        renderSearchResults(matches);
    });

    // Generate result rows cleanly
    function renderSearchResults(matches) {
        if (matches.length === 0) {
            resultsContainer.innerHTML = `<div class="p-4 text-gray-500 text-sm">No contacts found matching that search criteria.</div>`;
            resultsContainer.classList.remove('hidden');
            return;
        }

        const itemsHtml = matches.map(person => {
            // Check if it's an extension or a full mobile line for click-to-call matching
            const callUrl = person.number.startsWith('Ext.') ? `tel:${person.number.replace('Ext. ', '')}` : `tel:${person.number.replace(/\D/g,'')}`;
            
            return `
                <div class="p-3 hover:bg-gray-50 flex justify-between items-center transition-colors">
                    <div>
                        <div class="font-semibold text-gray-900 text-sm">${person.name}</div>
                        <div class="text-xs text-gray-500">${person.dept} &bull; <span class="italic">${person.loc}</span></div>
                    </div>
                    <div class="text-right">
                        <a href="${callUrl}" class="inline-block text-sm font-bold text-blue-600 hover:underline bg-blue-50 px-3 py-1.5 rounded-md">
                            ${person.number}
                        </a>
                    </div>
                </div>
            `;
        }).join('');

        resultsContainer.innerHTML = itemsHtml;
        resultsContainer.classList.remove('hidden');
    }

    // Dismiss results pane click interceptor
    document.addEventListener('click', (e) => {
        if (!searchInput.contains(e.target) && !resultsContainer.contains(e.target)) {
            resultsContainer.classList.add('hidden');
        }
    });
});
