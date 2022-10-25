var phoneBook: [String:String] = [:]
let n = Int(readLine()!)!

for _ in 1...n {
    let currentLine = readLine()!.split(separator: " ")
    phoneBook[String(currentLine[0])] = String(currentLine[1])
}

while(true) {
    if let query = readLine() {
        if(phoneBook[query] != nil) {
            print(query + "=" + phoneBook[query]!)
        } else {
            print("Not found")
        }
    } else {
        break
    }
}
