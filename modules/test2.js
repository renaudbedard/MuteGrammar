// local state
var state = "new";

function init() {
	// perform initialization
	state = "initialized";
}

function destroy() {
	// perform un-initialization
	state = "destroyed";
	console.print ('Destroying module test2');
}

function test() {
	memory.dump();
	console.print(state);
	console.logError("oh no!");
}

function dump() {
	memory.dump();
}

// Useless Java integration example: exiting the interpreter process
function exit() {
	console.print("Exiting from module");
	Java.type('java.lang.System').exit (0);
}

function throwError() {
	throw "thrown from js";
}
