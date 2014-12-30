package org.jzy3d.plot3d.primitives.log;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;

import org.jzy3d.plot3d.primitives.log.transformers.LogTransformer;
import org.jzy3d.plot3d.rendering.compat.GLES2CompatUtils;

public class AxeTransformableQuad extends AxeTransformableAbstractGeometry {

	public AxeTransformableQuad(LogTransformer transformers) {
	    super(transformers);
	}

    protected void begin(GL gl) {
        if (gl.isGL2()) {
            gl.getGL2().glBegin(GL2.GL_QUADS);
        } else {
            GLES2CompatUtils.glBegin(GL2.GL_QUADS);
        }
    }
}