package com.dantsu.escposprinter;

public class EscPosCharsetEncoding {
    private final String charsetName;
    private final byte[] charsetCommand;

    /**
     * Create a new instance of EscPosCharsetEncoding.
     *
     * @param charsetName Name of charset encoding (Ex: windows-1252)
     * @param escPosCharsetId Id of charset encoding for your printer (Ex: 16)
     */
    public EscPosCharsetEncoding(String charsetName, int escPosCharsetId) {
        this.charsetName = charsetName;
        this.charsetCommand = new byte[]{0x1B, 0x74, (byte) escPosCharsetId};
    }

    public byte[] getCommand() {
        return charsetCommand;
    }

    public String getName() {
        return charsetName;
    }
}
