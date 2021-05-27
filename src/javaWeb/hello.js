/*
var a=1;
var b="hello";
console.log(a);
console.log(b);
console.log("hello 1");

var a={
    name:"hello",
    "age":18
};

console.log(a.name);
console.log(a["age"]);

for(var key in a){
    //key :name.age
    console.log(key);
    console.log(a[key]);
}

var c=[1,2,3,4];
for(var i in c){
    console.log(c[i]);
}

for(var e of c){
    console.log(e);
}

console.log(c.length);
c.push("dede");

for(var i in c){
    console.log(c[i]);
}

//var e=c.pop();


function add(a,b) {
    return a+b;
}

var f=add;
console.log(f(1,2));

function callFunc(func,a,b) {
    return func(a,b);
}

console.log(callFunc(add,10,20));
/*console.log(callFunc(function (x,y) {
    return x*y;
}),10,20);*/

class Person{
    constructor(name,age) {
        this.name=name;
        this.age=age;
    }

    dede(target){
        console.log(this.name+"对"+target+" say:no way");
    }
}

var u=new Person("dd",12);
console.log(u);
console.log(u.name);
u.dede("geigei");

