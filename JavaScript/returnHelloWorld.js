/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return re();
    }

    function re() {
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */