const curringFn = function (fn) {
    return function (a) {
        return function (b) {
            return fn(a, b);
        }
    }
}

const addFn = function (a, b) {
    return a + b;
}

const muliflyFn = function (a, b) {
    return a * b;
}

const curringFirst = curringFn(addFn);
const curringSecond = curringFirst(1);
const curringThird = curringSecond(2);
const curringFourth = curringFirst(10)(20);

console.log(curringFirst);
console.log(curringSecond);
console.log(curringThird);
console.log(curringFourth);

const curringFn2 = fn2 => a => b => fn2(a, b);

const curringFirst2 = curringFn2(muliflyFn);
const curringSecond2 = curringFirst2(2);
const curringThird2 = curringSecond2(3);
const curringFourth2 = curringFirst2(10)(20);

console.log(curringFirst2);
console.log(curringSecond2);
console.log(curringThird2);
console.log(curringFourth2);




