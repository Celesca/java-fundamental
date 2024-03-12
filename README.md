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

# Abstract (Lecture 56)

Abstract คือ คลาสที่เป็นนามธรรม ไม่มีจริง ไม่สามารถสร้าง Object จากมันได้ มันเป็นข้อตกลงว่าสิ่งต่างๆที่สืบทอดต่อจะมีข้อตกลงอะไรบ้าง มีพฤติกรรม Attribute อะไรบ้าง
ตัว Abstract มันจะไม่ลง Details (พฤติกรรมหรือลักษณะ) มันจะไม่มีการทำงานภายในให้ดูเลย

Method อันไหนที่ Animal มันไม่มีเหมือนกัน ให้มันสืบทอดไปแล้ว Implement ของมันเอง เราจะเรียกว่า `Abstract Method` 
เช่น public abstract void walk(); มันจะไม่บอก Behaviour (พฤติกรรม) ให้คนอื่นมาสืบทอดแล้ว Implement เอง

ตัวอย่างเช่น


public class Hippo extends Animal{
    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}

จากนั้นเราจะสามารถทำงานเป็น Animal animal = new Hippo(); ได้ เพราะมีคลาสแม่เป็น Animal ดังนั้นมันสามารถทำได้ทุกอย่างของแทม่ แค่มันไป Override ตัวลูกเพิ่มขึ้นมาอีก

## Interface (Lecture 58)
Interface - ส่วนประสานต่อ เช่น ปลั๊กเต้าเสียบ ต้องมีรู้ที่ขนาดเท่ากัน หรือ การติดต่อกับระบบหนึ่งจะต้องมี Protocol เดียวกัน

ความต่างจาก Abstract และ Interface คล้ายกัน Interface จะมีเพียงชื่อ Method ซึ่งจะไม่มีการ Implement Method ปกติได้เลย

Interface - กำหนดรูปแบบการส่งต่อ อุปกรณ์ปลายทางเราไม่จำเป็นต้องรู้ เพราะเรามีรูเสียบปลั๊ก (Interface) เรียบร้อยแล้ว

มักจะใช้บ่อยกับการเขียนกับคนอื่น ติดต่อกับคนอื่น เราสามารถนำมาใช้ได้เลย อารมณ์ประมาณ OpenAPI Specification (Swagger) นั่นเองเวลาเราทำ API Endpoints


