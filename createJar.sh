#!/bin/bash

mkdir out
javac src/* -d out
cd out
jar cfe RandomQuestionsAllocator.jar RandomQuestionsAllocator *.class
mv RandomQuestionsAllocator.jar ../
cd ..
rm -rf out
echo "Jar created!"
