/* Haribol!
 *
 * #1 - Everything is an object
 * ----------------------------
 *
 * We can call member functions and properties on any variable.
 * "Some of the types can have special internal representation - for example,
 * numbers, characters and booleans can be represented as primitive values at runtime - 
 * but to the user they look like ordinary classes."
 *
 *
 * #2 - Integer Types
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
 * #3 - Int Type Inference
 * -----------------------
 * Variables which are initialized with integers not exceeding the maximum value of Int are inferred to be of Int type.
 */
val one = 1 // Int
 
 
/* #4 - Long Type Inference
 * ------------------------
 * Variables initialized with values bigger than the maximum value of Int are inferred to be of type Long.
 */
val big10 = 10000000000 // Long - 10 billion
val oneLong = 1L // use 'L' suffix to force inferred type as Long


/* #5 - No type inferrence for smaller integer types
 * -------------------------------------------------
 * Types smaller than Int cannot be inferred; type needs to be specified explicitly
 */
val oneByte: Byte = 1
