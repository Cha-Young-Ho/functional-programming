
function b() {
    return "b";
}
function c() {
    return "c";
}
function d() {
    return "d";
}
function e() {
    return "e";
}
function f() {
    return "f";
}
function g() {
    return "g";
}
function h() {
    return "b";
}

function proc1(a) {
    if(a === "b") {
        return b();
    }
    else if(a === "c") {
        return c();
    }
    else if(a === "d") {
        return d();
    }
    else if(a === "e") {
        return e();
    }
    else if(a === "f") {
        return f();
    }
    else if(a === "g") {
        return g();
    }
    else if(a === "h") {
        return h();
    }
    else {
        return "x";
    }
}
console.log(proc1("b"));

var b2 = function b() {
    return "b";
}
var c2 = function c() {
    return "c";
}
var d2 = function d() {
    return "d";
}
var e2 = function e() {
    return "e";
}
var f2 = function f() {
    return "f";
}
var g2 = function g() {
    return "g";
}
var h2 = function h() {
    return "b";
}

var funcMap = new Map();

funcMap.set("b", b2);
funcMap.set("c", c2);
funcMap.set("d", d2);
funcMap.set("e", e2);
funcMap.set("f", f2);
funcMap.set("g", g2);
funcMap.set("h", h2);

function proc2(a) {
    return funcMap.get(a)();
}

console.log("proc2 : " + proc2("b"));