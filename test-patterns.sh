#!/usr/bin/env nix-shell 
#! nix-shell -i bash --pure
#! nix-shell -p nodejs-slim python3 gcc jdk ghc
#! nix-shell -I nixpkgs=channel:nixos-22.11

for file in patterns/JavaScript/*/*.js; 
do 
    node $file; 
done

for file in patterns/Python/*/*.py; 
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
    folder="$(dirname "$file")"
    javac $file --source-path $folder -d .build; 
done
rm -rf .build

mkdir .build
for file in patterns/Haskell/*/*.hs; 
do 
    ghc -odir .build -hidir .build -S -o .build/haskell $file; 
done

rm -rf .build