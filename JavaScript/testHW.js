const HelloWorld = require('./HelloWorld.js').HelloWorld;
const {expect} = require("chai");
let hw = new HelloWorld();

describe('Simple Test', () => {
    it('should return "Hello World!"', () => {
        expect(hw.HelloWorld("Hello World!")).to.equal("Hello World!");
    });
})