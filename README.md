<div align="center">

<img src="https://dev.talken.in/assets/img/icons/colorpicker.png" width="96" alt="Color Picker logo">

# Color Picker

**Pick any colour, copy it as RGB, HEX or HSB.**

[Project page](https://dev.talken.in/projects/color-picker.html) · [Download](https://github.com/Shashwat-Gupta57/Color-Picker/releases/latest) · [All my projects](https://dev.talken.in/#work)

</div>

---

<img src="https://dev.talken.in/assets/img/shots/colorpicker-2.webp" alt="After picking a colour: the whole window takes it on" width="100%">
<p align="center"><sub>After picking a colour: the whole window takes it on</sub></p>

<img src="https://dev.talken.in/assets/img/shots/colorpicker-1.webp" alt="RGB, HEX and HSB, each one click from the clipboard" width="100%">
<p align="center"><sub>RGB, HEX and HSB, each one click from the clipboard</sub></p>

## About

A tiny tool I built twice: first in Swing, then again from scratch in JavaFX. Pick a colour and the whole window becomes it, with its RGB, HEX and HSB codes one click away from the clipboard — the thing I kept needing while designing my other apps.

## What it does

- **Three formats** — RGB, HEX and HSB side by side.
- **One-click copy** — Each format has its own copy button.
- **Live preview** — The window itself turns into the colour you picked.
- **Built twice** — The Swing original, then a JavaFX rebuild.

## Download & run

1. These apps need **Java 21 or newer**. If you don't have it, install it once with the [JRE Installer](https://github.com/Shashwat-Gupta57/JRE-Installer/releases/latest) — one click, no admin rights. Every app looks for Java in the place it installs to first, then in `JAVA_HOME`.
2. Download **`Color-Picker-1.0.0-windows.zip`** from the [latest release](https://github.com/Shashwat-Gupta57/Color-Picker/releases/latest).
3. Unzip it anywhere you can write to (Desktop, Documents…) and run **`Color Picker.exe`**.

The folders next to the exe (images, fonts, saves) are part of the app — keep them together.

## Run from source

Open the folder in **BlueJ** (it's a BlueJ project — `package.bluej`) and run `main.main()`, or with any JDK 21+:

```bash
javac *.java
java main
```

## Two versions

- **Root folder** — the original Swing app (this is the one in the release).
- **`javafx-version/`** — the same app rebuilt from scratch in JavaFX (Maven: `./mvnw javafx:run`).

## Under the hood

| | |
|---|---|
| v1 | Java Swing with JColorChooser |
| v2 | JavaFX rebuild (Maven) |

## License

[GPL-3.0](LICENSE) © Shashwat Gupta · Flex Studios

Made by [Shashwat Gupta](https://dev.talken.in/) — see more at **[dev.talken.in](https://dev.talken.in/)**.
