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

console.log('uncurrying');
console.log('f: A => B => C');
console.log('(a: A, b: B) { (a, b) => f(a)(b) }');

console.log('composition');
console.log('f: A => B, g: B => C');
console.log('a: A { a => g(f(a)) }');
