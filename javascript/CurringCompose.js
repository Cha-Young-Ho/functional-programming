const compose3 = fx => gx => (...dx) => temp => {
    let result;

    if (dx.length > 0) {
        // dx 함수들을 오른쪽부터 실행
        result = gx(temp);
        for (let i = dx.length - 1; i >= 0; i--) {
            result = dx[i](result);
        }
    } else {
        result = gx(temp);
    }

    // fx 함수에 결과 전달
    return fx(result);
};

const add = function (a) {
    return a + 4;
}
const add2 = function (a) {
    return a + 3;
}
const add3 = function (a) {
    return a + 2;
}
const add4 = function (a) {
    return a + 1;
}

const firstFunction = compose3(add);
const secondFunction = firstFunction(add2);
const thirdFunction = secondFunction(add3, add4);
const fourthFunction = thirdFunction(1);

console.log("fistFunction : ", firstFunction);
console.log("secondFunction : ", secondFunction);
console.log("thirdFunction : ", thirdFunction);
console.log("fourthFunction : ", fourthFunction);


