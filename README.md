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
* int 是32 bits
---
# 2020/1/29
## ByteShortIntLong Project
### Main.java
```java=
byte myMinByteValue = Byte.MIN_VALUE;
byte myMaxByteValue = Byte.MAX_VALUE;
short myMinShortValue = Short.MIN_VALUE;
short myMaxShortValue = Short.MAX_VALUE;
long myMinlongValue = Long.MIN_VALUE;
long myMaxlongValue = Long.MAX_VALUE;
```
* byte: **-128~127** 佔8 bits
* short: **-32768~32767** 佔16 bits
* long: **-9223372036854775808~9223372036854775807** 佔64 bits
* long宣告方式：
```java=
long bigLongLiteralValue = 2_147_483_647_234L;
```
## ByteShortIntLong Project
### Main.java
#### 型別轉換 Casting
```java=
byte MyNewByteValue = (byte)(myMinByteValue / 2);
short myNewShortValue = (short)(myMinShortValue / 2);
```
* 當進行運算時如果遇到型別不同必須進行型別轉換
#### Float and Double
* 低精確數值：32 bits => float
* 高精確數值：64 bits => double
* Float minimum value = 1.4E-45
* Float maximum value = 3.4028235E38
* Double minimum value = 4.9E-324
* Double maximum value = 1.7976931348623157E308
* **稍微記住小數點幾位即可7位以及16位**
* float如果沒寫f會因為判定小數為double發生錯誤
* **遇到小數盡量用double**
* BigDecimal可以解決更精確的問題
## CharAndBoolean Project
### Main.java
#### Char and Boolean
```java=
char myChar = 'D';
char myUnicodeChar = '\u0044';
System.out.println(myChar);
System.out.println(myUnicodeChar);
		
char myCopyrightChar = '\u00A9';
System.out.println(myCopyrightChar);	
```
* 2 bytes 16 bits memory
* Unicode萬國碼：\u+4位數字
* Unicode萬國碼表： https://unicode-table.com/en/#control-character

* Boolean: **True, False; Yse, No; 1 or 0**
## PrimitiveTypesRecapAndString Project
### Main.java
#### String
* String不是基本型別
* String是一成不變的(immutable)，不管哪種value加上去都是以字串相加方式
```java=
String myString = "This is a string";
System.out.println("myString is equal to " + myString);
myString = myString + ", and this is more. ";
System.out.println("myString is equal to " + myString);
// 使用萬國碼在String
myString = myString + " \u00A9 2019";
System.out.println("myString is equal to " + myString);
String numberString = "250.55";
numberString = numberString + "49.95";
System.out.println(numberString);
String lastString = "10";
int myInt = 50;
// 這樣加會把myInt當作String加起來
lastString = lastString + myInt;
System.out.println("LastString is equal to " + lastString);
double doubleNumber = 120.47d;
lastString = lastString + doubleNumber;
System.out.println("LastString is equal to " + lastString);
```
Console: 
myString is equal to This is a string
myString is equal to This is a string, and this is more. 
myString is equal to This is a string, and this is more.  © 2019
250.5549.95
LastString is equal to 1050
LastString is equal to 1050120.47
* String 不能隨便改變，是低效的，StringBuffer可以加強
---
## OperatorsOperandsAndExpressions Project
### Main.java
#### 運算子與運算式
* operands: int c = a + b，其中的a與b就是opprands，+是opperators
* expression: 整個叫做運算式
```java=
	// 1 + 2 = 3
	int result = 1 + 2; 
	System.out.println("1 + 2 = " + result);
	int previousResult = result;
	System.out.println("previousResult = " + previousResult);
	// 3 - 1 = 2
	result = result - 1;
	System.out.println("3 - 1 = " + result);
	System.out.println("previousResult = " + previousResult);
	// 2 * 10 = 20
	result = result * 10; 
	System.out.println("2 * 10 = " + result);
		
	// 20 / 5 = 4
	result = result / 5;
	System.out.println("20 / 5 = " + result);
	// the remainder of (4 % 3) = 1
	result = result % 3;
	System.out.println("4 % 3 = " + result);
	previousResult = result;
	System.out.println("previousResult = " + previousResult);
```
Console:
1 + 2 = 3
previousResult = 3
3 - 1 = 2
previousResult = 3
2 * 10 = 20
20 / 5 = 4
4 % 3 = 1
previousResult = 1
* previousResult第二個不會因為result值改變而跟著變，需要跟第三個再把result新值給它才會改變
---
## OperatorsOperandsAndExpressions Project
### Main.java
#### if-then
```java=
boolean isAlien = false;
		// 如果不寫大括弧只能印出一行code block
		if (isAlien == false) {
			System.out.println("It isn't an alien!");
			System.out.println("And I am scared of aliens");
		}
```
Console: 
It isn't an alien!
And I am scared of aliens
* 大括弧整個是一個code block
```java=
if (isAlien == false)
			System.out.println("It isn't an alien!");
			System.out.println("And I am scared of aliens");
```
* 如果沒寫括弧只會判斷一行，第二行是直接print出來，並不是code block內
* 條件判斷時，能縮減就縮減，比較簡單明瞭，程式也不會太冗長
#### 三元運算子 ternary 
```java=
isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}
```
* 如果wasCar = isCar 正確等於true，錯誤等於false
---
## KeywordsAndExpression Project
### Main.java
⭐️ ***這邊有點不確定***
* Expression Component: 有變數以及運算式
```java=
double kilometers = (100 * 1.609344);
```
## StatementWhiteSpaceAndIndenting
### Main.java
```java=
	
	int anotherVariable = 50;myVariable--;System.out.println("This is another one");
	int                       myVariable1 = 
		20;
```
* Statement可以寫在同一行但不建議
* 空白是會被忽略的
```java=
	if(gameOver == true) {
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("Your final score was " + finalScore);
		}
		
	// 寫在這邊會看不到if裡面finaScore的區域變數
	int savedFinalScore = finalScore;
```
* if裡面製造變數只要脫離code block就結束，所以外面無法使用
```java=
		if (score < 5000 && score > 1000) {
			System.out.println("Your score was less than 5000 but greater than 1000");
		} else if(score < 1000) {
			System.out.println("Your score less than 1000");
		} else {
			System.out.println("This was executed");
		}
```
* 如果第一條if就被成立，Java的執行會立即跳出if判斷式
---
## IfKeyWordAndCodeBlocks Project
### Main.java
#### 方法 Method
> 解決太煩人的重複操作
1. static 不給值：
```java=
	public static void calculateScoreOriginal() {
		boolean gameOver = true;
		int score = 100;
		int levelCompleted = 2;
		int bonus = 3;
		
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			System.out.println("Your final score was " + finalScore);
		}
	}
		
```
* 給static只會吸道全域變數，所以Main class內的區域變數無法使用，必須在該class設初始值
```java=
		boolean gameOver = true;
		int score = 100;
		int levelCompleted = 2;
		int bonus = 3;
		
		calculateScoreOriginal();
		
		gameOver = false;
		
		calculateScoreOriginal();
```
* 不會因為在Main class做這樣設定而有所改變
2. static給值：
```java=
public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
	if(gameOver == true) {
		int finalScore = score + (levelCompleted * bonus);
		finalScore+=1000;
			System.out.println("Your final score was " + finalScore);
		}
	}

```
* 這樣在括弧裡面已經宣告過，就無法在方法內給初始值
```java=
	// 執行方法
	calculateScore(true, 800, 5, 100);
```
* 這樣執行方法
3. 設定return 
```java=
public static int calculateScoreInt(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			return finalScore;
		}else {
			return -1;
		}
	}
```
* 在Main裡面宣告就可以給一個int變數：
```java=
int highScore = calculateScoreInt(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
```
# 2019/01/31
## SpeedConverter project
### SpeedConverter.java
> 這邊是在教學code excerise，重點不是程式碼，是使用過程中，所學的一些範例用到的方法紀錄
* **Math.random()**：四捨五入
```java=
long milesPerHour = Math.round(kilometersPerHour / 1.609);
```
## BarkingDog project
### BarkingDog.java 
> 這題想了很久，回去可以再看看
```java=
public class BarkingDog {

    // 第一個boolean是狗已經在叫了，如果是true
    // 第二個int時間介於0-23
    // 只有8點以前或22點以後，結果是true
    // 少於0或大於23也是false
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        boolean result = false;
        if(hourOfDay < 0 || hourOfDay > 23) {
            result = false;
        } else if(hourOfDay >= 8 && hourOfDay <= 22) {
            result = false;   
        } else if(hourOfDay > 0 || hourOfDay < 8 || hourOfDay > 22) {
            if (barking == true){
                result = true; 
            } else {
                result = false;
            }
        }
        return result; 
      
    }
}
```
---
# 2019/02/01
## MethodOverloading project
### Main.java
> 多載介紹：型別一樣只是最後的引數不同的同名方法
#### 寸轉公分 多載Overloading
```java=
public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}
	
	// 寸轉公分
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if(feet < 0 || (inches < 0 && inches > 12)) {
			System.out.println("Invalid");
			return -1; 
		}else {
			double centimeters = (feet * 12) * 2.54;
			centimeters += inches * 2.54;
			System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
			return centimeters;
		}
	}
```
* Method Overloading 允許我們可以有多個名稱相同的方法，但用不同的引數(parameters)
* 盡量用多載去設計方法，避免同功能名稱不同的方法出現，增加易讀性與重複使用性
* Main方法本身就是一個Overloading，准許我們print String, int...
#### INVALID_VALUE_MESSAGE 錯誤訊息全域變數
```java=
private static final String INVALID_VALUE_MESSAGE = "Invalid value";
public static String getDurationString(int mins, int secs) {

		if (mins < 0 || (secs < 0 || secs > 59)) {
			return INVALID_VALUE_MESSAGE;
		} else {
			// 小時等於分鐘/60整除
			// 餘數的分鐘等於新的分鐘
			// 秒數/60的+分鐘
			// 秒數等於剩餘的秒數
			// 1小時等於3600秒
			// 秒數不用因為沒超過60
			int hours = mins / 60;
			// 把原本輸入的分鐘數減少
			mins = mins % 60;
			
			// 如果還沒大於10的話前面要加一個0
			String hoursString = hours + "h";
			if(hours < 10) {
				hoursString = "0" + hoursString;
			}
			
			String minutesString = mins + "m";
			if(mins < 10) {
				minutesString = "0" + minutesString;
			}
			
			String secondsString = secs + "s";
			if(secs < 10) {
				secondsString = "0" + secondsString;
			}
			
//			return (hours + "h " + mins + "m " + secs + "s ");
			return hoursString + " " + minutesString + " " + secondsString + " ";
		}
	}
```
## PlayCat Project
### ⭐️PlayingCat.java
>判斷布林值，但寫法有點高超，值得參考
```java=
package tw.luchienlin.java.overloading;

public class PlayingCat {

	public static void main(String[] args) {

		isCatPlaying(true, 33);
	}

	// 超級高超寫法
	// 值得參考
	public static boolean isCatPlaying(boolean summer, int temp) {
		return (summer && (temp > 24 && temp < 46)) || (!summer && (temp > 24 && temp < 36));
	}
}
```
---
## Switch Porject
### Main.java
#### switch method
> switch只探討一個value，探討一個變數等於哪個值的時候很好用
```java=
public static void main(String[] args) {
		
		int switchValue = 1;
		
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
				
			case 2:
				System.out.println("Value was 2");
				break;
			case 3: case 4: case 5:
				System.out.println("Value was 3, 4, or 5")
				break;
			default: 
				System.out.println("Was not 1 or 2");
				break;
		}

		//  break會跳到這邊
	}
```
* break會直接跳出迴圈
* 如果沒有break會一直跳到有break或default
#### ⭐️theLeapYear 進階：
> 輸出月份以及年且需要判斷當年是否為閏年，2月有差
```java=
public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
         }
         else if(year % 4 == 0){
             if(year % 100 == 0){
                 if(year % 400 == 0){
                     return true;
                 }
                 else
                     return false;
             }
             else
                 return true;
         }
         else
             return false;
    }
 
    public static int getDaysInMonth(int month, int year){
         if(year < 1 || year > 9999){
            return -1;
         }
         else
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if(isLeapYear(year)){
                        return 29;
                    }
                    else{
                        return 28;
                    }
                case 4: case 6: case 9: case 11:
                    return 30;
                    
                default:
                    return -1;
            }
    } 
}
```
# 2019/02/05
## ForLoop project
### Main.java
#### 如何寫小數點第幾位
```java=
		for (int i = 8; i >= 2; i--) {
			System.out.println(
					"10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
		}
```
* 小數點只有兩位
* 使用String.format的方法
### Main.java
#### 判斷是不是質數 
```java=
// Create a for statement using any range of numbers
// Determing if the number is prime number using the isPrime method
// if it is a prime, print it out AND increment a count of the number of prime numbers found
// if that count is 3 exit the for loop
	
	
	// 判斷是不是Prime number
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		// 寄算平方根，不然就是i <= n/2
		for (int i=2; i<=(long)Math.sqrt(n); i++) {
			System.out.println("Lopping" + i);
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
```
* Math.sqrt(n)是平方根
* 不然就用i<=n/2




		
