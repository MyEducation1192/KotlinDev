package dummy.nodomain;

// top level function
fun main(vararg args: String){
	val red: Color;
	red = Color.RED;
	
	val green: Color;
	green = Color.GREEN;
	
	println(Integer.toString(red.r));
	println(Integer.toString(green.g));
}

enum class Color constructor(val r: Int, val g: Int, val b: Int){
	RED(255, 0, 0), 
	GREEN(0, 255, 0), 
	BLUE(0, 0, 255);
	/*
	var r: Int;
	var g: Int;
	var b: Int;
	
	init{
		this.r = 99;
		this.g = 99;
		this.b = 99;
	}
	*/
	/*
	// secondary constructor
	constructor(r: Int, g: Int, b: Int): this(){
		this.r = r;
		this.g = g;
		this.b = b;
	}
	*/
}