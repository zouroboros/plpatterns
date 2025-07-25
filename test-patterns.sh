#!/usr/bin/env nix-shell 
#! nix-shell -i bash --pure
#! nix-shell -p nodejs-slim python3 gcc jdk ghc dotnet-sdk
#! nix-shell -I nixpkgs=channel:nixos-25.05

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
    if [[ ! "$file" =~ ^"patterns/Haskell/y-combinator/" ]];
    then
        folder="./$(dirname "$file")"
        fileName="$(basename "$file")"
        fileNameWithOutExtension="${fileName%.*}"
        cd $folder
        ghc --make $fileName;
        rm *.hi
        rm *.o
        rm -f $fileNameWithOutExtension
        cd "../../../"
    fi
done

rm -rf .build

for file in patterns/CSharp/*/*.csproj; 
do 
    folder="$(dirname "$file")"
    dotnet run --project $file
    rm -rf $folder/bin
    rm -rf $folder/obj 
done
