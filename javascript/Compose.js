const compose = function (acc, ...functions) {
    let startIndex = functions.length - 1;
    let accumulator = acc === undefined ? 0 : acc;
    for (let i = startIndex; i >= 0; i--) {
        accumulator = functions[i](accumulator);
    }

    return accumulator;
}

const firstFunction = function (a) {
    return a + 1;
}

const secondFunction = function (b) {
    return b * 10;
}

const thirdFunction = function (c) {
    return c * 10;
}

let testFunction = compose(0, thirdFunction, secondFunction, firstFunction);
console.log(testFunction);

const compose2 = (fx, gx, ...dx) => temp => {
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

console.log(compose2(firstFunction, firstFunction, firstFunction, firstFunction)(2))
