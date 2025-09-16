‭ level 0-`1:‬

‭Commands used:‬
‭ssh bandit0@bandit.labs.overthewire.org -p 2220 // to establish connection‬
‭ls // to display the contents‬
‭cat readme // to get the contents of readme‬
‭Password: ZjLjTmM6FvvyRnrb2rfNWOZOTa6ip5If‬
‭ level 1-2:‬

‭Commands Used:‬
‭exit‬
‭ssh‬‭bandit1@bandit.labs.overthewire.org‬‭-p 2220‬
‭password-ZjLjTmM6FvvyRnrb2rfNWOZOTa6ip5If‬
‭ls‬
‭cat ./- // makes linux treat it like a normal file using ./ and reads the contents‬
‭PASSWORD- 263JGJPfgU6LtdEvgfWU1XP5yac29mFx‬
‭ lEVEL 2-3‬

‭Commands used:‬
‭exit‬
‭ssh‬‭bandit2@bandit.labs.overthewire.org‬‭-p 2220‬
‭password-263JGJPfgU6LtdEvgfWU1XP5yac29mFx‬
‭ls‬
‭cat ./--spaces\ in\ this\ filename– // ./ is used the make linux treat it like a normal filename‬
‭PASSWORD-MNk8KNH3Usiio41PRUEoDFPqfxLPlSmx‬
‭ lEVEL 3-4‬

‭Commands used:‬
‭exit‬
‭ssh‬‭bandit3@bandit.labs.overthewire.org‬‭-p 2220‬
‭Password-MNk8KNH3Usiio41PRUEoDFPqfxLPlSmx‬
‭cd inhere // to make inhere the current directory‬
‭ls -a // to display the hidden files‬
‭cat ./...Hiding-From-You‬
‭PASSWORD-2WmrDFRmJIq3IPxneAaMGhap0pFhF3NJ‬
‭LEVEL 4-5‬
‭Commands used:‬
‭exit‬
‭ssh‬‭bandit4@bandit.labs.overthewire.org‬‭-p 2220‬
‭Password-2WmrDFRmJIq3IPxneAaMGhap0pFhF3NJ‬l‭s‬
‭cd inhere‬
‭file ./* // to display the file types‬
‭cat ./-file07‬
‭PASSWORD-4oQYVPkxZOOEOO5pTW81FB8j8lxXGUQw‬
‭ LEVEL 5-6‬

‭Commands used:‬
‭exit‬
‭ssh‬‭bandit5@bandit.labs.overthewire.org‬‭-p 2220‬
‭Password -4oQYVPkxZOOEOO5pTW81FB8j8lxXGUQw‬
‭ d inhere‬
c
‭find . -type f -size 1033c // it finds the file with 1033 bytes‬
‭cat ./maybehere07/.file2‬
‭Password -HWasnPhtq9AVKe0dmk45nxy20cvUa6EG‬
‭ LEVEL 6-7‬

‭exit‬
‭ssh bandit6@bandit.labs.overthewire.org -p 2220‬
‭Password - HWasnPhtq9AVKe0dmk45nxy20cvUa6EG‬
f‭ind / -type f -user bandit7 -group bandit6 -size 33c // it finds files owned by bandit 7 belonging‬
‭to group bandit 6 and has a size of 33 bytes‬
‭cat /var/lib/dpkg/info/bandit7.password // prints the contents of the file path obtained‬
‭PASSWORD - morbNTDkSW6jIlUc0ymOdMaLnOlFVAaj‬
‭ LEVEL 7-8‬

‭exit‬
‭ssh bandit7@bandit.labs.overthewire.org -p 2220‬
‭Password - morbNTDkSW6jIlUc0ymOdMaLnOlFVAaj‬
l‭s‬
‭grep "millionth" data.txt // finds the line containing millionth in the file data.txt and prints its text‬
‭PASSWORD - dfwvzFQi4mU0wfNbFOe9RoWskMLg7eEc‬
‭LEVEL 8-9‬‭ 
Exit‬

‭ssh bandit8@bandit.labs.overthewire.org -p 2220‬
‭Password - dfwvzFQi4mU0wfNbFOe9RoWskMLg7eEc‬
l‭s‬
‭sort data.txt > sorted.txt // sorts the file and saves it into a new file sorted.txt‬
‭uniq -u sorted.txt // prints line that occurs only once in the sorted file‬
‭PASSWORD - 4CKMh1JI91bUIZZPXDqGanal4xvAg0JM‬
‭ lEVEL 9-10‬

‭exit‬
‭ssh bandit9@bandit.labs.overthewire.org -p 2220‬
‭Password - 4CKMh1JI91bUIZZPXDqGanal4xvAg0JM‬
l‭s‬
‭strings data.txt | grep "==" // strings extracts only the human readable ascii parts and grep finds‬
‭and prints line with “==”‬
‭PASSWORD - FGUW5ilLVJrxX9kMYMmlN4MgbpfMiqey‬
‭ LEVEL 10-11‬
‭exit‬
‭ssh bandit10@bandit.labs.overthewire.org -p 2220‬
‭Password - FGUW5ilLVJrxX9kMYMmlN4MgbpfMiqey‬
l‭s‬
‭cat data.txt
// view the base64 encoded text‬
‭base64 -d data.txt // decode base64 to get the password‬
‭PASSWORD - dtR173fZKb0RRsDFSGsg2RWnpNVj3qRr‬
