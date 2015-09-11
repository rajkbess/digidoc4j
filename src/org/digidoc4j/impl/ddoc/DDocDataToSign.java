/* DigiDoc4J library
*
* This software is released under either the GNU Library General Public
* License (see LICENSE.LGPL).
*
* Note that the only valid version of the LGPL license as far as this
* project is concerned is the original GNU Library General Public License
* Version 2.1, February 1999
*/

package org.digidoc4j.impl.ddoc;

import org.digidoc4j.DataToSign;
import org.digidoc4j.Signature;
import org.digidoc4j.SignatureParameters;

public class DDocDataToSign extends DataToSign {

  private DDocFacade jDigiDocFacade;

  public DDocDataToSign(byte[] digestToSign, SignatureParameters signatureParameters, DDocFacade jDigiDocFacade) {
    super(digestToSign, signatureParameters);
    this.jDigiDocFacade = jDigiDocFacade;
  }

  @Override
  public Signature finalize(byte[] signatureValue) {
    return jDigiDocFacade.signRaw(signatureValue);
  }
}