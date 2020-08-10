/* Haribol!
 *
 * Sutra #1 - Program execution entry point
 * The main function is an entry point of a Kotlin app.
 */

fun main() {
  println("Hello Guys")
}
 

/* Sutra #2 - Read-only variable definitions
 * -----------------------------------------
 *
 * Read-only variables are defined using val; they can be assigned only once.
 * Types can be inferred when they are assigned with a value immediately at the point of definition.
 */
val a: Int = 1 // explicit type specification isn't required
val b = 2 // Type is inferred as Int
val c: Int
c = 3 // deferred asignment


/* Sutra #3 - Read-write variable definitions
 * ------------------------------------------
 *
 * Variables defined using var keyword can be assigned multiple types.
 */

/*
 * Sutra #4 - Everything is an object
 * ----------------------------
 *
 * We can call member functions and properties on any variable.
 * "Some of the types can have special internal representation - for example,
 * numbers, characters and booleans can be represented as primitive values at runtime - 
 * but to the user they look like ordinary classes."
 *
 *
 * Sutra #5 - Integer Types
 * ------------------
 *
 * Four types of integers:
 *
 *    Type    Size (bits)      Range
 * ---------------------------------------
 * 1. Byte -   8          [-128, 127]
 * 2. Short - 16        [-32768, 32767]
 * 3. Int -   32        [-2e31, 2e31 - 1]
 * 4. Long -  64        [-2e63, 2e63 - 1]
 *
 *
 * Sutra #6 - Int Type Inference
 * -----------------------
 * Integers not exceeding the maximum value of Int are inferred to be of type Int.
 */
val one = 1 // Int
 
 
/*
 * Sutra #7 - Long Type Inference
 * ------------------------
 * Variables initialized with values bigger than the maximum value of Int are inferred to be of type Long.
 */
val big10 = 10000000000 // Long - 10 billion
val oneLong = 1L // use 'L' suffix to force inferred type as Long


/*
 * Sutra #8 - No type inferrence for smaller integer types
 * -------------------------------------------------
 * Types smaller than Int cannot be inferred; type needs to be specified explicitly.
 */
val oneByte: Byte = 1


/* 
 * Sutra #9 - Floating-Point types
 * -------------------------------
 * These types are represented and manipulated according to IEEE 754 standard.
 * There's a type each for representing single and double precision floating-point numbers.
 *
 *    Type    Size (bits)  Significant (bits)  Exponent (bits)  Decimal digits
 * ---------------------------------------------------------------------------
 * 1. Float   32           24                  8                6-7
 * 2. Double  64           53                  11               15-16
 */

/* 
 * Sutra #10 - Type inference for Double type
 * -----------------------------------------
 * Variables initialized with floating-point numbers are inferred to be of type Double.
 */

