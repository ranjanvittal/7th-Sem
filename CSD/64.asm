SECTION .data
    msg        db "Please enter a number: ",0xa
    msglen     EQU $-msg
    sz         EQU 32
    NUL        EQU 0
    len        EQU 32

SECTION .bss
    num        resb len

SECTION .text
    GLOBAL start
start:

Msg:                             ; display the message
    mov        eax, 4
    mov        ebx, 1
    mov        ecx, msg
    mov        edx, msglen
    int        0x80

Read:                            ; read in the number
    mov        eax, 3
    mov        ebx, 1
    mov        ecx, num
    mov        edx, len
    int        80h


Length:                          ; Find length of string
    mov        eax, num
    mov        ebx, 0
    loop:
    cmp        BYTE[eax], NUL
    je         Set
    inc        eax
    inc        ebx
    jmp        loop

Set:                             ; set up the registers and variables
    mov        ecx, num

Print:                           ; main section - prints out the number plus 1
    cmp        BYTE[ecx], NUL
    je         Exit
    mov        eax, 4
    mov        ebx, 1
    mov        edx, 1            ; NOTE- does not yet add 1 to the number
    int        80h

    inc        ecx
    jmp        Print

Exit:                            ; exits safely
    mov        eax, 1
    mov        ebx, 0
    int        80h
