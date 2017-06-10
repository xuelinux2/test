### What is pylite?
pylite is a hobby python interpreter, which can tell you how python compiler and virtual machine works. It serves for educational purposes, so the code is kept as simple as possible. 

pylite consists of two executables: pycom and pyvm. pycom is the compiler, which has 5000 LOC. pyvm is the virtual machine, which has 6000 LOC.

### How to build? 
1. build pycom and pyvm 
   cd pylite && make DEBUG=0
2. add pycom and pyvm to PATH vaiable 
   PATH=`pwd`/com:`pwd`/vm:$PATH
3. run tests
   cd tests && ./run 
4. run a simple HttpServer
   cd httpd && pyvm server.py
   open the browser and access http://localhost:8080

### Implemented features:
1. builtin objects: list/dict/tuple/slice/range
2. if/while/for
3. function (closure is not supported)
4. class (only support single inheritance)
5. module
6. exception handling
7. a simple GC

Known bugs:
-----------
1. 在缩进中，只能使用4空格或则TAB
2. 必须在一行完成list/dict/tuple的字面表示，不能跨行
