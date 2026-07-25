# Git Setup and Configuration Lab

## Objective
- Setup Git configuration.
- Configure user name and email.
- Integrate Notepad++ as the default editor.
- Create a Git repository.
- Add a file to the repository.
- Commit and push the file to a remote repository.

---

# Step 1: Check Git Installation

```bash
git --version
```

---

# Step 2: Configure Git Username

```bash
git config --global user.name "Your Name"
```

Example:

```bash
git config --global user.name "Niranjana Devi"
```

---

# Step 3: Configure Git Email

```bash
git config --global user.email "your_email@example.com"
```

Example:

```bash
git config --global user.email "niranjana@example.com"
```

---

# Step 4: Verify Configuration

```bash
git config --global --list
```

---

# Step 5: Verify Notepad++

```bash
notepad++
```

---

# Step 6: Configure Notepad++ as Default Editor

```bash
git config --global core.editor "notepad++"
```

---

# Step 7: Verify Default Editor

```bash
git var GIT_EDITOR
```

---

# Step 8: Create a New Repository

```bash
mkdir GitDemo
cd GitDemo
git init
```

---

# Step 9: Verify Repository

```bash
ls -la
```

---

# Step 10: Create welcome.txt

```bash
echo Welcome to Git Demo > welcome.txt
```

---

# Step 11: Verify File

```bash
ls
```

---

# Step 12: View File Content

```bash
cat welcome.txt
```

---

# Step 13: Check Repository Status

```bash
git status
```

---

# Step 14: Add File to Staging Area

```bash
git add welcome.txt
```

---

# Step 15: Commit Changes

```bash
git commit
```

(Add a commit message in the editor.)

Or

```bash
git commit -m "Added welcome.txt"
```

---

# Step 16: Verify Status

```bash
git status
```

---

# Step 17: Pull Remote Repository

```bash
git pull origin master
```

---

# Step 18: Push Local Repository

```bash
git push origin master
```
