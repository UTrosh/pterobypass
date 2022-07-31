# pterobypass script
 WARNING :
 
 ./start.sh PORT HOMECONTAINER
 
 Example :
 
 ./start.sh 25566 /home/container
 
 WARN : the port is only to make the password for root and make ssh working, you need a second port NOT USED to use ssh.
 
 
# CUSTOM SCRIPT
You can use custom script to use custom command, here some example :
Are example are for pterodactyl

## SSH START SCRIPT
```
#!/bin/bash

cd /home/container


./dist/proot -S ./bin/bash -c "service dropbear start"
```

## How it work?
To make a script with pterobypass, you need the first two line !
```
#!/bin/bash

cd /home/container
```
The first line define bash script
and the second define where is the bash bin.

Then if we want to execute bash command, we need this line
``` 
./dist/proot -S ./bin/bash -c "echo "My beautiful script" "
```

The first word define that we use root, and the second word define bash command
