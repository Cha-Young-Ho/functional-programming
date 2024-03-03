const foo = function (a) {
    console.log(a);
}

foo("Hello World!");

const runFn = function(fn, temp) {
    fn(temp);
}

runFn(foo, "Bye World!")