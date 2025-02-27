package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/** This list is used to report the timeout and state for the ACT. This list may be
 *  generated by TPM2_GetCapabilty(). Only implemented ACT are present in the list
 */
public class TPML_ACT_DATA extends TpmStructure implements TPMU_CAPABILITIES
{
    /** Array of ACT data */
    public TPMS_ACT_DATA[] actData;

    public TPML_ACT_DATA() {}

    /** @param _actData Array of ACT data */
    public TPML_ACT_DATA(TPMS_ACT_DATA[] _actData) { actData = _actData; }

    /** TpmUnion method */
    public TPM_CAP GetUnionSelector() { return TPM_CAP.ACT; }

    /** TpmMarshaller method */
    @Override
    public void toTpm(TpmBuffer buf) { buf.writeObjArr(actData); }

    /** TpmMarshaller method */
    @Override
    public void initFromTpm(TpmBuffer buf) { actData = buf.readObjArr(TPMS_ACT_DATA.class); }

    /** @deprecated Use {@link #toBytes()} instead
     *  @return Wire (marshaled) representation of this object
     */
    public byte[] toTpm () { return toBytes(); }

    /** Static marshaling helper
     *  @param byteBuf Wire representation of the object
     *  @return New object constructed from its wire representation
     */
    public static TPML_ACT_DATA fromBytes (byte[] byteBuf) 
    {
        return new TpmBuffer(byteBuf).createObj(TPML_ACT_DATA.class);
    }

    /** @deprecated Use {@link #fromBytes(byte[])} instead
     *  @param byteBuf Wire representation of the object
     *  @return New object constructed from its wire representation
     */
    public static TPML_ACT_DATA fromTpm (byte[] byteBuf)  { return fromBytes(byteBuf); }

    /** Static marshaling helper
     *  @param buf Wire representation of the object
     *  @return New object constructed from its wire representation
     */
    public static TPML_ACT_DATA fromTpm (TpmBuffer buf) 
    {
        return buf.createObj(TPML_ACT_DATA.class);
    }

    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPML_ACT_DATA");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }

    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
        _p.add(d, "TPMS_ACT_DATA[]", "actData", actData);
    }
}

//<<<
