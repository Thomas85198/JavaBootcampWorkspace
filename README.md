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
# 2020/01/31
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
# 2020/02/01
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
# 2020/02/05
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
---
# 2020/02/07
## WhileLoop project
### Main.java
#### 判斷是不是偶數並用while迴圈執行
```java=
int number = 4;
		int finishNumber = 20;
		while(number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				// 如果不是偶數則跳出if block
				continue;
			}
			System.out.println("Even number " + number);
		}
		
		
		
		
	}
	
	public static boolean isEvenNumber(int num) {
		if(num%2 == 0) {
			return true;
		}
		return false;
	}
```
#### while, do while break and continue Recap
* while迴圈是用來在一開始判斷條件
* do while是至少執行一次，再判斷條件
* 請時常確認條件，以防進入無窮迴圈

#### while, do while break and continue Recap
* 打斷透過**continue**或**break**
* continue中斷當時的那個條件，直接進入下一個while判斷
* break直接跳離while迴圈

### DigitSumChallenge.java
#### ⭐️判斷大於等於10後的數字各位數相加
```java=
public static int sumDigits(int number) {
		if(number < 10) {
			return -1;
			
		} 
		
		int sum = 0;
			// 125 -> 125 / 10 = 12 * 10 --> 125 - 120 = 5 
			// 十位適用numbers/10去算
			// 百位
		while(number > 0) {
			// 最小的
			// extract the least-significant digit
			int digit = number % 10;
			sum += digit;
			
			// drop the least-significant digit
			// 每次就會往前提一位
			number /= 10; // same as number = number / 10;
			
		}
		return sum;
	}
```
---
# 2019/02/08
### ParsingValueFromString project
#### Main.java
> 教學如何從String轉數值做運算
* 運用Wrapper才有parseInt
* 但如果有不符數值的東西轉成數值就會錯
```java=
String numberAsString = "2018.125";
		System.out.println("numberAsString= " + numberAsString);
		
		// 數字轉字串
		// Wrapper Class
		// Wrapper Class有parseInt
		// 但如果有其他不能計算的字就會有誤
		double number = Double.parseDouble(numberAsString);
		System.out.println("number = " + number);
		
		numberAsString += 1;
		number += 1;
		
		// 字串+1，就是後面加一
		// 數值才會+1
		System.out.println("numberAsString = " + numberAsString);
		System.out.println("number = " + number);
```
---
# 2020/02/12
### While project
#### NumbersToWord.java
> ⭐️這題精華的運用，寫三個方法一個判斷幾位數，一個將數字倒過來，並要以文字印出
```java=
package tw.luchienlin.java.whileloop;

public class NumbersToWords {

	public static void main(String[] args) {
		numberToWords(0);
		
		numberToWords(1);
		
	}
	public static int getDigitCount(int number) {
		// 計算有幾位數
		int count = 0;
		if(number < 0) {
			return -1;
		} else {
			while(number / 10 != 0) {
				number = number/10;
				count++;
			}
			return count+1;
		}
	}
	
	public static int reserve(int number) {
		int reserve = 0;
		int digit;
		while(number != 0) {
			digit = number % 10;
			// reserve * 10+剩餘的個位數
			reserve = reserve * 10 + digit;
			number = number / 10;
		}
		return reserve;
	}
	
	public static void numberToWords(int number) {
		int digitCount = getDigitCount(number);
		number = reserve(number);
		// last digit 最後一位
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		
		while(digitCount > 0) {
			switch(number%10) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			}
			number=number/10;	
			digitCount--;
		}
		
		}
		
	}
```
### ParsingValuesFromString project
#### LargestPrime.java
> ⭐️我完全不知道這題在幹嘛，盼對最大質數要看過
```java=
package tw.luchienlin.java.common;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPrime(4444));
	}
	public static int getLargestPrime(int number) {
			int count = number;
			int primeCount = 0;
			int largestPrime = 0;
			
			// 先判斷 0, 1 與負數
			if(number <= 1) {
				return -1;
			}
			while(count > 0) {
				for(int i=1; i<=number; i++) {
					if(count == 1) {
						break;
					}
				
					if(i <= count) {
						if(count % i == 0) {
							primeCount++;
						}
						
						if(count == i && primeCount == 2) {
							if(number % count == 0) {
								largestPrime = count;
								count = 1;
							}
						}
					}
				}
				count--;
				primeCount = 0;
			}
			return largestPrime;
	}
}
```
#### Diagonal Star.java
> 判斷星星
四個條件用，boolean值去做
```java=
	public static void printSquareStar(int number) {
		
		if(number<5) {
			System.out.println("Invalid Vlaue");
		}else {
			for(int row = 1; row <= number; row++) {
				for(int col = 1; col <= number; col++) {
					boolean isStar = (row == 1) || (col == 1) || (row == number) || (col == number) || (row == col) ||(col == number-row+1);
					System.out.print(isStar ? "*" : " " );
				}
				System.out.println();
			}
		}
	}
```
---
# 2020/02/14
### ReadingUserInput project
#### Main.java
```java=
// Build in class let can read user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		// name 當成要抓取輸入的變數
		System.out.println("Your name is " + name);
		
		scanner.close();
```
* 結束要放一個Scanner.close();
#### 如果遇到要輸入兩次，以及兩個問題？
```java=
	// Build in class let can read user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth:");
		int yearOfBirth = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		int age = 2018 - yearOfBirth;
		
		// name 當成要抓取輸入的變數
		System.out.println("Your name is " + name);
		
		System.out.println("Your birth is " + yearOfBirth);
		
		System.out.println("Your are " + age + " years old.");
		
		scanner.close();
```
* Scanner.nextLine()是關鍵
#### 防止錯誤輸入，做變數條件判斷
```java=
			// 做判斷
			if(age >= 0 && age <= 100) {
				System.out.println("Your name is " + name + ", and you are " + age + " years old.");
			} else {
				System.out.println("Invalid year of birth");
			}
```
#### boolean值判斷是否有hasNextInt
> 判斷是否接下來Int值，如果輸錯會跳到else
```java=
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth:");
		
		boolean hasNextInt = scanner.hasNextInt();
		
		if(hasNextInt) {
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			int age = 2018 - yearOfBirth;
			
			// 做判斷
			if(age >= 0 && age <= 100) {
				System.out.println("Your name is " + name + ", and you are " + age + " years old.");
			} else {
				System.out.println("Invalid year of birth");
			}
			
			// name 當成要抓取輸入的變數
			System.out.println("Your name is " + name);
			
			System.out.println("Your birth is " + yearOfBirth);
			
			System.out.println("Your are " + age + " years old.");
		} else {
			System.out.println("Unable to parse year of birth");
		}
		
		scanner.close();
		
	}
```
#### 對於輸入的值，印出最大值與最小：
⭐️不太懂在幹嘛，然後比大小很重要
```java=
package MinAndMaxInputChallenge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		// boolean first = true;
				
		while(true) {
			System.out.println("ENTER NUMBER:");
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt) {
				int number = scanner.nextInt();
				// 不太懂flag在這邊的事情
//				if(first) {
//					first = false;
//					min = number;
//					max = number;
//				}
//				
				if(number > max) {
					max = number;
				}
				
				if(number < min) {
					min = number;
				}
			} else {
				break;
			}
			
			scanner.nextLine();
			
			
		}
		System.out.println("min= " + min + ", max= " + max);
		scanner.close();
	}

}
```
---
### Class project
#### Main.java
#### 修飾字權限
> public 不受限制的修飾字
private 沒有其他可以使用該class
protected 這個package可以使用
* 在class宣告變數field，就必須一樣要有修飾字，一般都會用private
* 要利用class裡面的東西就要宣告物件new
* 如果都沒有寫方法java會有些物件可以內建使用方法
--- 
# 2020/02/15
## Class project
#### Main.java
#### get set取private field
```java=			
		Car porsche = new Car();
		Car holden = new Car();
		
		System.out.println("Modal is " + porsche.getModal());

		porsche.setModal("Carrera");
		
		System.out.println("Modal is " + porsche.getModal());
```
* 預設getModal()是null，所以第一個還沒有setModal是print out Modal is null
* set的用處是給值以外，也可以加入商業邏輯判斷...
* get就是取值

```java=
// 裡面的String modal跟上面的不一樣
	public void setModal(String modal) {
		// 如果要將值傳同名的到上面就要用this
		String validModal = modal.toLowerCase();
		// String.equals是去判斷String的值
		if(validModal.equals("porsche") || validModal.contentEquals("holden")) {
			this.modal = modal;
		} else {
			this.modal = "Unkown";
		}
		
	}
	
	public String getModal() {
		return this.modal;
	}
```
* .equals是String判斷內容的方法
* this.firstName.isEmpty()：判斷是否為空字串
---
## Constructor project
#### Main.java
#### 建構子裡面使用this
```java=
public Account() {
		// 呼叫另一個建構子
		this("56789", 2.50, "Default name", "Default address", "default phone");
		System.out.println("Empty constructor called");
	}
```
> 呼叫另一個建構子
* 在建構子內就不要去用下面的set方法，直接給值，雖然用了也不會錯，但不建議
* 建構子呼叫必須是第一句
* 設計邏輯最好是一個建構子對應fields其他的this
```java=
	// 建構子
	public Account() {
		// 呼叫另一個建構子
		this("56789", 2.50, "Default name", "Default address", "default phone");
		System.out.println("Empty constructor called");
	}
	
	public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		// 建構子呼叫必須是第一個
		// 透過上一個呼叫並設定預設值
		this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
	}
```
#### Point.java and Main.java
#### class裡面宣告物件參數
> 這樣就可以在Main裡面使用其他new過的物件當作參數
```java=
// 宣告物件參數，裡面可以給其他物件名稱
	public double distance(Point another) {
		return distance(another.x, another.y);
		
	}
```
Main.java
```java=
Point first = new Point(6, 5);
		Point second = new Point(3, 1);
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2, 2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
```
---
## Inheritance project
### Dog.java Main.java Animal.java
#### 繼承
> 繼承別人一定要有父類別的建構子
* super就是呼叫父層的東西
* 子層可以複寫Override父層的方法
```java=
public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String cont;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String cont) {
		// 繼承來自父類別的參數
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.cont = cont;
	}
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	// 寫他
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
```
* 以上為子層
---
# 2020/2/24
#### THIS VS SUPER
* this vs super 可以用在任何地方，除了static的部分
* super是用在要寫Override父層的方法時使用，因為要呼叫父層方法：
```java=
@Override
public void printMethod(){
	super.printMethod() //呼叫父層的方法
	}
}
```
* 呼叫parent的建構子，super()
* Java會自動帶一個建構子，裡面含有super()，如果我們沒有特別寫
* 建構子可以有super、this但不能兩個同時
#### 好的Constructor寫法：
```java=
public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	
	
	public Rectangle() {
		this(0,0);
	}
		
	public Rectangle(int width, int height) {
		this(0,0,width,height);
	}	
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	
}
```
#### Super
```java=
public class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}

class Square extends Shape {

	private int width;
	private int height;
	
	public Square(int x, int y) {
		this(x,y,0,0);
	}
	
	public Square(int x, int y, int width, int height) {
		super(x, y); // calls the parent (shape)
		this.width = width;
		this.height = height;
	}

	
	
}
```
#### 如果沒有super，編譯器會自動給一個在子層的無參數建構子
```java=
class Animal {
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("dog is created");
    }
}

class TestSuper4 {
    public static void main(String args[]) {
        Dog d = new Dog();
    }
}
```
編譯結果：
animal is created
dog is created
---
# 2020/2/25
#### Overloading
> 給予使用者同方法名稱、不同參數，讓撰寫不必記得一堆參數
* 也可以透過繼承達到子類別負載父類別
只要遵守定義：不同修飾字、回傳值可同可不同
#### Overriding 就像IS A relationship
> 定義一個子方法然後父層已經有的並修改他
* **same name and same argus**
* 回傳值可以是父層也可以子層自己指定，但是回傳型別要相同
* **不能比父層修飾字低階**
ex. public > protected > private
* 只有繼承才有覆寫
* **建構子以及private不能**
* final的方法也不行
* **子曾利用super.methodName()去呼叫superclass
```java=
class Burger {
}
class HealthyBurger extends Burger {
}
```
```java=
class BurgerFactory {
  public Burger createBurger(){
  	return new Burger()
  }
}

class HealthyBurgerFactory extends BurgerFactory {

  @Override
  public HealthyBurger createBurger() {
  	return new HealthyBurger();
  }
}
```
https://magiclen.org/hackerrank-covariant-return-types/
---
# 2020/2/26
#### static and instance method
* static methods不能與實體化方法或是實體化變數同時使用
* 他不用new
* 他就不會用到this
* 呼叫方法ClassName.methodName();除非是一樣的ClassName才能直接寫methodName();
* instance method就是平常在使用的要new的物件，也可以直接使用static method
#### 設計邏輯
探討方法要不要用static➡️需要使用fields或methods嗎➡️不用則static要則instance

#### Static Variables
* 透過static宣告的變數
* 所有使用這個static變數的人值都一樣，如果改變了則全部都會變
```java=
class Dog {
	private static String name;
	
	public Dog(String name){
		Dog.name = name;
	}
	public void printName() {
		System.out.println("name = " + name);
	}
}
public class Main {
	public static void main(String[] args){
		Dog rex = new Dog("rex"); // create instance(rex)
		Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
		rex.printName(); // print fluffy
		fluffy.printName(); // print fluffy
	}
}
}
```
#### instance
> 上面如果不是static就會獨立印出rex, fluffy
	
