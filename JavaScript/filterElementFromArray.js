// without using filter method


/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    // return arr.filter(fn);
    let newarr = [];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            newarr.push(arr[i]);
        }
    }
    return newarr;
};


// using filter method

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    return arr.filter(fn);
};