import { depthFirst } from "./depthFirst.js";

const tree = {
    value: 1,
    children: [{
            value: 10,
            children: [{
                value: 100
            }, {
                value: 101,
            }, {
                value: 102,
                children: [{
                    value: 1020
                }]
            }]
        },{
            value: 20,
            children: [{
                value: 200
            }, {
                value: 201,
            }]
        },{
            value: 30,
            children: []
        },

    ]
}

for (const value of depthFirst(tree)) {
    console.log(value)
}