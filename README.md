# ratpack-multiserver-example
[![Build Status](https://travis-ci.org/gregwhitaker/ratpack-multiserver-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/ratpack-multiserver-example)

An example of starting two [Ratpack](https://www.ratpack.io) servers, on different ports, within a single application.

## Running the Example
1. Start the example by running the following Gradle command:

        $ ./gradlew run

2. Once the application has started access the `/hello` endpoint by running the following command:

        $ curl http://localhost:5050/hello

    You should see the following response:
    
        Hello, World!
        
3. Next access the `/hello/count` endpoint, hosted on the other port, by running the following command:

        $ curl http://localhost:5051/hello/count
        
    You should see that you have accessed the endpoint `1` time.

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-multiserver-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.