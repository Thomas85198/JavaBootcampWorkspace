# 2020/1/28
## Hello Project
### Hello.java
> 最基本的Java語法
```java=
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
```
* public是類別存取的修飾字，可以准許我們存取Java code在裡面
* void 即代表此方法不會回傳任何東西

```java=
int myFirstNumber = (10 + 5) + (2 * 10);
System.out.println(myFirstNumber);
```
* int myFirstNumber = ...：Declartion Statement（宣告）
* Expression：表達單值的構造
* String Literal 雙引號刮著的字串，不像變數可以隨便改變
---
#### 原始型態 Primitive Type
* **boolean, byte, char, short, int, long, float, double**
## ByteShortIntLong Project
### Main.java
> 介紹型態以及其區域範圍
```java=
int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		
		System.out.println("Bused MAX value = " + (myMaxIntValue + 1));
		System.out.println("Bused MIN value = " + (myMinIntValue - 1));
		
		// 底線可以忽略
		int myMaxIntTest = 2_147_483_647;
		System.out.println(myMaxIntTest);
```
* Integer是Wrapper class
* Overflow因為int介於 **-2147483648~2147483647**
