<mxfile host="app.diagrams.net">
  <diagram id="vidasaludER" name="VidaSalud - E-R">
    <mxGraphModel>
      <root>
        <mxCell id="0"/>
        <mxCell id="1" parent="0"/>

        <!-- Usuarios -->
        <mxCell id="usuarios" value="Usuarios&#xa;PK: id&#xa;email (único)&#xa;password_hash&#xa;nombre&#xa;apellidos&#xa;teléfono&#xa;fecha_nacimiento&#xa;género&#xa;dirección&#xa;documento_identidad (único)&#xa;tipo_documento&#xa;FK: rol_id&#xa;activo&#xa;email_verificado&#xa;último_login&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#dae8fc;strokeColor=#6c8ebf;" vertex="1">
          <mxGeometry x="40" y="40" width="220" height="280" as="geometry"/>
        </mxCell>

        <!-- Roles -->
        <mxCell id="roles" value="Roles&#xa;PK: id&#xa;nombre (único)&#xa;descripción&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#fff2cc;strokeColor=#d6b656;" vertex="1">
          <mxGeometry x="340" y="40" width="200" height="120" as="geometry"/>
        </mxCell>

        <!-- Pacientes -->
        <mxCell id="pacientes" value="Pacientes&#xa;PK: id&#xa;FK: usuario_id (único)&#xa;tipo_sangre&#xa;alergias&#xa;enfermedades_cronicas&#xa;medicamentos_actuales&#xa;contacto_emergencia_nombre&#xa;contacto_emergencia_telefono&#xa;seguro_medico&#xa;numero_seguro&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#d5e8d4;strokeColor=#82b366;" vertex="1">
          <mxGeometry x="40" y="400" width="250" height="260" as="geometry"/>
        </mxCell>

        <!-- Medicos -->
        <mxCell id="medicos" value="Medicos&#xa;PK: id&#xa;FK: usuario_id (único)&#xa;FK: especialidad_id&#xa;numero_licencia (único)&#xa;universidad&#xa;años_experiencia&#xa;biografía&#xa;precio_consulta&#xa;calificacion_promedio&#xa;total_consultas&#xa;disponible&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#f8cecc;strokeColor=#b85450;" vertex="1">
          <mxGeometry x="340" y="220" width="250" height="240" as="geometry"/>
        </mxCell>

        <!-- Especialidades -->
        <mxCell id="especialidades" value="Especialidades&#xa;PK: id&#xa;nombre (único)&#xa;descripción&#xa;duracion_cita_default&#xa;precio_base&#xa;activo&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#e1d5e7;strokeColor=#9673a6;" vertex="1">
          <mxGeometry x="650" y="240" width="220" height="180" as="geometry"/>
        </mxCell>

        <!-- Consultorios -->
        <mxCell id="consultorios" value="Consultorios&#xa;PK: id&#xa;nombre&#xa;descripción&#xa;ubicación&#xa;capacidad&#xa;equipamiento&#xa;activo&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#ffe6cc;strokeColor=#d79b00;" vertex="1">
          <mxGeometry x="940" y="240" width="220" height="180" as="geometry"/>
        </mxCell>

        <!-- Horarios_atencion -->
        <mxCell id="horarios" value="Horarios_atención&#xa;PK: id&#xa;FK: medico_id&#xa;FK: consultorio_id&#xa;dia_semana (1–7)&#xa;hora_inicio&#xa;hora_fin&#xa;duracion_cita&#xa;activo&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#f1f1f1;strokeColor=#999999;" vertex="1">
          <mxGeometry x="940" y="40" width="220" height="200" as="geometry"/>
        </mxCell>

        <!-- Citas -->
        <mxCell id="citas" value="Citas&#xa;PK: id&#xa;FK: paciente_id&#xa;FK: medico_id&#xa;FK: consultorio_id&#xa;FK: estado_id&#xa;fecha&#xa;hora_inicio&#xa;hora_fin&#xa;motivo_consulta&#xa;observaciones_medico&#xa;diagnostico&#xa;tratamiento&#xa;precio&#xa;pagado (bool)&#xa;recordatorio_enviado (bool)&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#cce5ff;strokeColor=#004085;" vertex="1">
          <mxGeometry x="340" y="500" width="280" height="280" as="geometry"/>
        </mxCell>

        <!-- Estados_cita -->
        <mxCell id="estados" value="Estados_cita&#xa;PK: id&#xa;nombre (único)&#xa;descripción&#xa;color&#xa;created_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#d1ecf1;strokeColor=#0c5460;" vertex="1">
          <mxGeometry x="650" y="500" width="200" height="140" as="geometry"/>
        </mxCell>

        <!-- Historiales_médicos -->
        <mxCell id="historiales" value="Historiales_médicos&#xa;PK: id&#xa;FK: paciente_id&#xa;FK: cita_id&#xa;fecha&#xa;peso&#xa;altura&#xa;presion_arterial&#xa;temperatura&#xa;frecuencia_cardiaca&#xa;síntomas&#xa;diagnóstico&#xa;tratamiento&#xa;medicamentos_recetados&#xa;exámenes_solicitados&#xa;observaciones&#xa;created_at&#xa;updated_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#e2f0d9;strokeColor=#548235;" vertex="1">
          <mxGeometry x="40" y="700" width="280" height="300" as="geometry"/>
        </mxCell>

        <!-- Calificaciones -->
        <mxCell id="calificaciones" value="Calificaciones&#xa;PK: id&#xa;FK: cita_id (único)&#xa;FK: paciente_id&#xa;FK: medico_id&#xa;calificación (1–5)&#xa;comentario&#xa;created_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#fde9d9;strokeColor=#c65911;" vertex="1">
          <mxGeometry x="650" y="700" width="220" height="160" as="geometry"/>
        </mxCell>

        <!-- Notificaciones -->
        <mxCell id="notificaciones" value="Notificaciones&#xa;PK: id&#xa;FK: usuario_id&#xa;FK: cita_id&#xa;título&#xa;mensaje&#xa;tipo (info, warning, error, success)&#xa;leída (bool)&#xa;created_at" style="shape=rectangle;whiteSpace=wrap;rounded=1;fillColor=#fff0f5;strokeColor=#c71585;" vertex="1">
          <mxGeometry x="940" y="500" width="230" height="160" as="geometry"/>
        </mxCell>

        <!-- Relaciones -->
        <mxCell id="rel1" edge="1" source="usuarios" target="roles" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel2" edge="1" source="usuarios" target="pacientes" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel3" edge="1" source="usuarios" target="medicos" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel4" edge="1" source="usuarios" target="notificaciones" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel5" edge="1" source="pacientes" target="citas" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel6" edge="1" source="medicos" target="citas" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel7" edge="1" source="medicos" target="horarios" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel8" edge="1" source="medicos" target="calificaciones" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel9" edge="1" source="especialidades" target="medicos" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel10" edge="1" source="consultorios" target="citas" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel11" edge="1" source="consultorios" target="horarios" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel12" edge="1" source="citas" target="historiales" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel13" edge="1" source="citas" target="calificaciones" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel14" edge="1" source="citas" target="notificaciones" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel15" edge="1" source="citas" target="estados" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel16" edge="1" source="pacientes" target="historiales" style="endArrow=block;endFill=1;"/>
        <mxCell id="rel17" edge="1" source="pacientes" target="calificaciones" style="endArrow=block;endFill=1;"/>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
