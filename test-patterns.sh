#!/usr/bin/env nix-shell 
#! nix-shell -i bash --pure
#! nix-shell -p nodejs-slim python3
#! nix-shell -I nixpkgs=channel:nixos-22.11

for file in patterns/javascript/*/*.js; 
do 
    node $file; 
done

for file in patterns/python/*/*.py; 
do 
    python3 $file; 
done
