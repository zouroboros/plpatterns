const myObject = {
    cake: ["flour", "egg", "sugar"],
    bread: ["germ", "flour", "water", "salt"],
    cookies: ["flour", "egg", "sugar", "chocolate"],
    pasta: ["wheat"],
    "potato soup": ["potatoes", "onions", "water", "carrots", "parsley"]
};

for (const key in myObject) {
    console.log(key);
}