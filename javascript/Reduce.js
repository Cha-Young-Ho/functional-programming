const reduce = function (array, callback, initial) {
    let sum = initial === undefined ? 0 : initial;
    for (let i = 0; i < array.length; i++) {
        sum = callback(sum, array[i]);
    }

    return sum;
}

const array = [1, 2, 3, 4, 5];

console.log(reduce(array, function (a, b) {
    return a + b;
}, 0));