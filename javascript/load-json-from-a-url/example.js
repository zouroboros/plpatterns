fetch("http://example.org/api/endpoint")
    .then(function (response) {
        return response.json();
    })
    .then(function(data) {
        // process data
        console.log(data);
    });