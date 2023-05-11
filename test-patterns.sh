#!/usr/bin/env nix-shell 
#! nix-shell -i bash --pure
#! nix-shell -p nodejs-slim python3 gcc jdk
#! nix-shell -I nixpkgs=channel:nixos-22.11

for file in patterns/javascript/*/*.js; 
do 
    node $file; 
done

for file in patterns/python/*/*.py; 
do 
    python3 $file; 
done

mkdir .build
for file in patterns/C/*/*.c; 
do 
    cc $file -o .build/app.out; 
done
rm -rf .build

for file in patterns/Java/*/*.java; 
do 
    javac $file -d .build; 
done
rm -rf .build
