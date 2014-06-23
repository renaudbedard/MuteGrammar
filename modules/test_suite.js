var state = "new";

function init() {
	if (state != "new")
		console.logError("state should be set to 'initialized' when destroying!");

	state = "initialized";
}

function destroy() {
	if (state != "initialized")
		console.logError("state should be set to 'initialized' when destroying!");

	state = "destroyed";
}

function consoleTests() {
	console.print("testing print function");
	console.logError("not actually an error! just testing the command.");
}

function dumpMemory() {
	memory.dump();
}

function javaInterop() {
	Java.type('java.lang.System').out.println("printing via Java.type object");
}

// validate assignment tests of the mute module test suite
function validate() {
	assert(numeric == 1, "numeric value not as expected");

	assert(arrayCopy.length == 3, "array length not as expected");
	assert(arrayCopy[0] == 1 && arrayCopy[1] == 2 && arrayCopy[2] == 3, "array elements value not as expected");

	assert(objectRef != null, "object reference does not exist");
	console.print(objectRef.toString());	
	assert(objectRef.has("foo"), "object member 'foo' does not exist");
	assert(objectRef.get("foo") == 1, "object member 'foo' not as expected");
	assert(objectRef.has("bar"), "object member 'bar' does not exist");
	assert(objectRef.get("bar") == "hi", "object member 'bar' not as expected");
}

function assert(condition, message) {
    if (!condition) {
        throw message || "Assertion failed";
    }
}
