# Refactoring (Lecture 45)

## Question : What is refactoring code and why do we need it?

Refactoring is the way to clean your code. For example, if your main class is your room and you don't clean it. It will have a chance to experience new bugs.
When you collaborate with others. If when you come back to read. It's hard to read. <br>
โค้ดสามารถดูได้เข้าใจมากขึ้น Performance มากขึ้น ไม่ใช่แค่บรรทัดลดลง

### 1. Refactoring
Grouping method to make it easy to configurate in future.

### 2. Inline Temp (Temporary)
The variable which is temporary (just use once time) like when you receive the scanner and then return it. <br>
If you just create that variable just for return. Remove it! <br>

ถ้าเราสร้างตัวแปรแล้วมันไม่มีประโยชน์ เราสามารถลบตัวแปรนั้นไปได้เลย เพราะว่ามันเอาไว้ใช้แค่ return ไง

ถ้าจะสร้างตัวแปรนั้นจะต้องใช้หลายๆที่ ประโยชน์มีความหมาย
Ex.

int userInput = displayMenu();
processMode(userInput)

Change to

processMode(displayMenu());

### 3. Temporary with Query/Method (แทนที่ข้อมูลด้วย Method, Query)

If somethings doesn't belong in that function. Just extract the method. Sometimes it has more lines in our code. But trust me it is more cleanly.

ถ้าเราสอบถามคนอื่น เราจะต้องถามคนอื่น บางอย่างไม่ใช่หน้าที่มัน เราจะไม่ใส่มันลงไป ให้ Extract Method ออกมา

### 4. Substitute Algorithm (แก้ไขด้วยอัลกอริทึม)

แทนที่เราจะเขียน If-else ยาวๆ ก็ให้ใช้ List มาวนซ้ำเอาดีกว่า

# Static (Lecture 49)

when we need to use the method in some class. If they are static method. we don't need to call from object. we can directly call static method from class.

# Constructor (Lecture 50)

we can create constructor with parameterized constructor or not.
If we write many constructor with different parameters. It is called `Overloading.`
