# This is an example python project

import sys
import testlib

def p(s):
    print(s)

p("asd")
p()

p(testlib.foo())
p(testlib.foo(123))
p(testlib.foo([]))
p(testlib.foo([], []))

testlib.foo()
testlib.foo(1, 2)
testlib.foo(1, 2, 3)

