// local state
var state = "new";

function init() {
	// perform initialization
	state = "initialized";
}

function destroy() {
	// perform un-initialization
	state = "destroyed";
}

function test() {
	memory.dump();
	console.print(state);
	console.logError("oh no!");
}
