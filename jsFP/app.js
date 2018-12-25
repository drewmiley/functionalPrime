console.log('Running JavaScript examples');

console.log('partial application');
console.log('a: A, f: (A, B) => C');
console.log('b: B { b => f(a, b) }');

const partialApplication = () => {
    const a = 2.5;
    const f = (a, b) => (a * b).toString();
    const partial = b => f(a, b);

    console.log(partial(2));
}
partialApplication();

console.log('currying');
console.log('f: (A, B) => C');
console.log('(a: A, b: B) { a => b => f(a, b) }');

const currying = () => {
    const f = (a, b) => (a * b).toString();
    const currying = a => b => f(a, b);

    console.log(currying(2.5)(2));
}
currying();

console.log('uncurrying');
console.log('f: A => B => C');
console.log('(a: A, b: B) { (a, b) => f(a)(b) }');

const uncurrying = () => {
    const f = a => b => (a * b).toString();
    const uncurrying = (a, b) => f(a)(b);

    console.log(uncurrying(2.5, 2));
}
uncurrying();

console.log('composition');
console.log('f: A => B, g: B => C');
console.log('a: A { a => g(f(a)) }');

const composition = () => {
    const f = a => (2 * a).toString();
    const g = b => parseInt(b.substr(0, 1));
    const composition = a => g(f(a));

    console.log(composition(2.5));
}
composition();
