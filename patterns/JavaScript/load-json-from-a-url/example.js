fetch("https://dummyjson.com/test")
    .then(function (response) {
        return response.json();
    })
    .then(function(data) {
        // process data
        console.log(data);
    });