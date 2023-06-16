const fs = require('fs/promises');

fs.readFile('fileToRead', { encoding: 'utf8' })
    .then(textContent => console.log(textContent));