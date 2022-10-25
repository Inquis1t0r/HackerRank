import Foundation
//import Darwin

let numStrings = Int(readLine()!)!

func printEvenAndOdd(string: String) {
    // This prints inputString to stderr for debugging:
    fputs("string: " + string + "\n", stderr)
	//let arr = Array(string.characters)
    let arr = Array(string)

    
    // Print the even-indexed characters
    // Write your code here
    for (idx, char) in arr.enumerated() {
        if idx % 2 == 0 {
            print(char, terminator: "")
        }
    }
    
    // Print a space
    print(" ", terminator: "")
	
    // Print the odd-indexed characters
    // Write your code here
    for (idx, char) in arr.enumerated() {
        if idx % 2 != 0 {
            print(char, terminator: "")
        }
    }
    
    // Print a newline
    print()
}

for _ in 1...numStrings {
    let inputString = readLine()!
    printEvenAndOdd(string: inputString)
}
