package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/** Most of the ECC signature schemes only require a hash algorithm to complete the
 *  definition and can be typed as TPMS_SCHEME_HASH. Anonymous algorithms also require a
 *  count value so they are typed to be TPMS_SCHEME_ECDAA.
 */
public class TPMS_SIG_SCHEME_ECSCHNORR extends TPMS_SCHEME_HASH
{
    public TPMS_SIG_SCHEME_ECSCHNORR() {}

    /** @param _hashAlg The hash algorithm used to digest the message */
    public TPMS_SIG_SCHEME_ECSCHNORR(TPM_ALG_ID _hashAlg) { super(_hashAlg); }

    /** TpmUnion method */
    public TPM_ALG_ID GetUnionSelector() { return TPM_ALG_ID.ECSCHNORR; }

    /** @deprecated Use {@link #toBytes()} instead
     *  @return Wire (marshaled) representation of this object
     */
    public byte[] toTpm () { return toBytes(); }

    /** Static marshaling helper
     *  @param byteBuf Wire representation of the object
     *  @return New object constructed from its wire representation
     */
    public static TPMS_SIG_SCHEME_ECSCHNORR fromBytes (byte[] byteBuf) 
    {
        return new TpmBuffer(byteBuf).createObj(TPMS_SIG_SCHEME_ECSCHNORR.class);
    }

    /** @deprecated Use {@link #fromBytes(byte[])} instead
     *  @param byteBuf Wire representation of the object
     *  @return New object constructed from its wire representation
     */
    public static TPMS_SIG_SCHEME_ECSCHNORR fromTpm (byte[] byteBuf)  { return fromBytes(byteBuf); }

    /** Static marshaling helper
     *  @param buf Wire representation of the object
     *  @return New object constructed from its wire representation
     */
    public static TPMS_SIG_SCHEME_ECSCHNORR fromTpm (TpmBuffer buf) 
    {
        return buf.createObj(TPMS_SIG_SCHEME_ECSCHNORR.class);
    }

    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPMS_SIG_SCHEME_ECSCHNORR");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
}

//<<<