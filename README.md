# String-StringBuilder-StringBuffer
A simple Java project demonstrating the differences between String, StringBuilder, and StringBuffer — covering immutability, mutability, synchronization, and performance.


## 📌 String
- **Immutable Class** → Once a `String` object is created, it cannot be changed.  
- Every modification creates a new object in the **String pool**.  
- Suitable when the data is **not frequently modified**.  
- **Thread-Safe** because it is immutable.

### Example:
String s = "Hello";
s.concat(" World");
System.out.println(s); // Output: Hello (not Hello World)


##📌 StringBuilder
- Mutable Class → Can be modified without creating new objects.
- Introduced in Java 1.5.
- Not synchronized → Better performance in single-threaded environments.
- Faster than both String and StringBuffer.

### Example:
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Output: Hello World


###📌 StringBuffer
- Mutable Class → Can be modified without creating new objects.
- Synchronized → Thread-safe but slower than StringBuilder.
- Used in multi-threaded environments when thread safety is required.

### Example:
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World");
System.out.println(sbf); // Output: Hello World


| Feature     | String (Immutable)  | StringBuilder (Mutable) | StringBuffer (Mutable)           |
| ----------- | ------------------- | ------------------------- | ----------------------------   |
| Mutability  | ❌ Immutable        | ✅ Mutable               | ✅ Mutable                    |
| Thread-Safe | ✅ Yes              | ❌ No                    | ✅ Yes                        |
| Performance | ❌ Slow             | ✅ Fastest               | ⚠️ Slower than StringBuilder  |
| Use Case    | Fixed data, keys    | Single-threaded apps      | Multi-threaded apps            |


### 🚀 Conclusion
- Use String when values don’t change often.
- Use StringBuilder for single-threaded applications with lots of modifications.
- Use StringBuffer for multi-threaded applications where thread safety is required.

