import os

dirs = [l for l in os.listdir('./') if os.path.isdir(l)]

for dir in dirs:
    print(f"{dir} 폴더에 {len(os.listdir(dir))}개의 파일")
