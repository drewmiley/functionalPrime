print('Running JavaScript examples');

print('partial application');
print('a: A, f: (A, B) => C');
print('b: B { b => f(a, b) }');

print('currying');
print('f: (A, B) => C');
print('(a: A, b: B) { a => b => f(a, b) }');

print('uncurrying');
print('f: A => B => C');
print('(a: A, b: B) { (a, b) => f(a)(b) }');

print('composition');
print('f: A => B, g: B => C');
print('a: A { a => g(f(a)) }');
