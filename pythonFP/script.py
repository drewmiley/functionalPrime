print('Running JavaScript examples');

print('partial application');
print('a: A, f: (A, B) => C');
print('b: B { b => f(a, b) }');

def partialApplication():
    a = 2.5
    def f(a, b):
        return str(a * b)
    def partial(b):
        return f(a, b)

    print(partial(2))
partialApplication()

print('currying');
print('f: (A, B) => C');
print('(a: A, b: B) { a => b => f(a, b) }');

def currying():
    def f(a, b):
        return str(a * b)
    currying = lambda a: lambda b: f(a, b)

    print(currying(2.5)(2))
currying()

print('uncurrying');
print('f: A => B => C');
print('(a: A, b: B) { (a, b) => f(a)(b) }');

print('composition');
print('f: A => B, g: B => C');
print('a: A { a => g(f(a)) }');

def composition():
    def f(a):
        return str(2 * a)
    def g(b):
        return int(b[:1])
    def composition(a):
        return g(f(a))

    print(composition(2.5))
composition()
